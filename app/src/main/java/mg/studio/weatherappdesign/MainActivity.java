package mg.studio.weatherappdesign;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {


    WeatherJavaBean weather = new WeatherJavaBean();
    private TextView textView_update_time;
    private TextView textView_today_date;
    private TextView textView_today_weekday;
    private TextView textView_weekday2;
    private TextView textView_weekday3;
    private TextView textView_weekday4;
    private TextView textView_weekday5;
    private TextView textView_today_temp;
    private TextView textView_date2;
    private TextView textView_date3;
    private TextView textView_date4;
    private TextView textView_date5;
    private ImageView imageView_today;
    private ImageView imageView_day2;
    private ImageView imageView_day3;
    private ImageView imageView_day4;
    private ImageView imageView_day5;
    private int time=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_date2=findViewById(R.id.tv_Date2);
        textView_date3=findViewById(R.id.tv_Date3);
        textView_date4=findViewById(R.id.tv_Date4);
        textView_date5=findViewById(R.id.tv_Date5);
        textView_today_weekday = findViewById(R.id.tv_Today_Weekday);
        textView_update_time = findViewById(R.id.tv_Update_Time);
        textView_today_date = findViewById(R.id.tv_today_date);
        textView_today_temp = findViewById(R.id.temperature_of_the_day);
        textView_weekday2 = findViewById(R.id.tv_Weekday2);
        textView_weekday3 = findViewById(R.id.tv_Weekday3);
        textView_weekday4 = findViewById(R.id.tv_Weekday4);
        textView_weekday5 = findViewById(R.id.tv_Weekday5);
        imageView_today = findViewById(R.id.img_weather_today);
        imageView_day2 = findViewById(R.id.img_weather_day2);
        imageView_day3 = findViewById(R.id.img_weather_day3);
        imageView_day4 = findViewById(R.id.img_weather_day4);
        imageView_day5 = findViewById(R.id.img_weather_day5);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        new DownloadUpdate().execute();

    }


    public void btnClick(View view) {
        new DownloadUpdate().execute();
    }


    private class DownloadUpdate extends AsyncTask<String, Void, String> {


        @Override
        protected String doInBackground(String... strings) {
            String stringUrl = "http://api.openweathermap.org/data/2.5/forecast?id=1814906&APPID=a3b95c62f346b7005d8f11593f567606&lang=zh_cn&units=metric";
            HttpURLConnection urlConnection = null;
            BufferedReader reader;

            try {
                URL url = new URL(stringUrl);

                // Create the request to get the information from the server, and open the connection
                urlConnection = (HttpURLConnection) url.openConnection();

                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                // Read the input stream into a String
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();
                if (inputStream == null) {
                    // Nothing to do.
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));

                String line;
                while ((line = reader.readLine()) != null) {
                    // Mainly needed for debugging
                    Log.d("TAG", line);
                    buffer.append(line + "\n");
                }

                if (buffer.length() == 0) {
                    // Stream was empty.  No point in parsing.
                    return null;
                }
                //The temperature
                Log.d("123string", buffer.toString());
                return buffer.toString();


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
        @Override
        protected void onPostExecute(String temperature) {
            weather=new Gson().fromJson(temperature,WeatherJavaBean.class);

            imageView_today.setImageResource(getWeatherIcon(weather.getList().get(1).getWeather().get(0).getDescription()));
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            textView_today_date.setText(format.format(new Date()));
            textView_today_weekday.setText(getWeekday(new Date()));


            textView_today_temp.setText(String.valueOf(weather.getList().get(1).getMain().getTemp()).substring(0,1));

            imageView_day2.setImageResource(getWeatherIcon(weather.getList().get(7).getWeather().get(0).getDescription()));
            imageView_day3.setImageResource(getWeatherIcon(weather.getList().get(15).getWeather().get(0).getDescription()));
            imageView_day4.setImageResource(getWeatherIcon(weather.getList().get(23).getWeather().get(0).getDescription()));
            imageView_day5.setImageResource(getWeatherIcon(weather.getList().get(31).getWeather().get(0).getDescription()));


            try {
                textView_weekday2.setText(getWeekday(format.parse(weather.getList().get(7).getDt_txt())));
                textView_weekday3.setText(getWeekday(format.parse(weather.getList().get(15).getDt_txt())));
                textView_weekday4.setText(getWeekday(format.parse(weather.getList().get(23).getDt_txt())));
                textView_weekday5.setText(getWeekday(format.parse(weather.getList().get(31).getDt_txt())));
            }catch(Exception e){e.printStackTrace();}


            textView_update_time.setText("最后刷新："+format1.format(new Date()));

            textView_date2.setText(weather.getList().get(7).getDt_txt().substring(0,10));
            textView_date3.setText(weather.getList().get(15).getDt_txt().substring(0,10));
            textView_date4.setText(weather.getList().get(23).getDt_txt().substring(0,10));
            textView_date5.setText(weather.getList().get(31).getDt_txt().substring(0,10));

            Toast.makeText(MainActivity.this, "天气更新成功！", Toast.LENGTH_SHORT).show();

        }
    }



    public String getWeekday(Date date) {
        String[] WeekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return WeekDays[w];
    }


    public int getWeatherIcon(String s){
        int result=0;
        if(s.contains("晴")){
            result=R.drawable.sunny_small;
        }else if(s.contains("雨")){
            result=R.drawable.rainy_small;
        }else if(s.contains("云")){
            result=R.drawable.partly_sunny_small;
        }else if(s.contains("风")){
            result=R.drawable.windy_small;
        }
        return result;
    }
}

