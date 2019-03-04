package mg.studio.weatherappdesign;

import java.util.List;


public class WeatherJavaBean {


    /**
     * cod : 200
     * message : 0.0058
     * cnt : 40
     * list : [{"dt":1551603600,"main":{"temp":14.6,"temp_min":13.76,"temp_max":14.6,"pressure":1010.53,"sea_level":1010.53,"grnd_level":922.13,"humidity":67,"temp_kf":0.84},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":0.56,"deg":351.5},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-03 09:00:00"},{"dt":1551614400,"main":{"temp":8.87,"temp_min":8.24,"temp_max":8.87,"pressure":1011.79,"sea_level":1011.79,"grnd_level":922.32,"humidity":83,"temp_kf":0.63},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":0.86,"deg":29.5018},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 12:00:00"},{"dt":1551625200,"main":{"temp":4.44,"temp_min":4.02,"temp_max":4.44,"pressure":1013.21,"sea_level":1013.21,"grnd_level":922.89,"humidity":92,"temp_kf":0.42},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":0.76,"deg":94.5004},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 15:00:00"},{"dt":1551636000,"main":{"temp":2.45,"temp_min":2.24,"temp_max":2.45,"pressure":1012.64,"sea_level":1012.64,"grnd_level":922.12,"humidity":90,"temp_kf":0.21},"weather":[{"id":801,"main":"Clouds","description":"晴，少云","icon":"02n"}],"clouds":{"all":12},"wind":{"speed":1.01,"deg":112.001},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 18:00:00"},{"dt":1551646800,"main":{"temp":1.75,"temp_min":1.75,"temp_max":1.75,"pressure":1011.72,"sea_level":1011.72,"grnd_level":921.12,"humidity":91,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"多云","icon":"03n"}],"clouds":{"all":32},"wind":{"speed":1.02,"deg":112},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 21:00:00"},{"dt":1551657600,"main":{"temp":3.44,"temp_min":3.44,"temp_max":3.44,"pressure":1011.52,"sea_level":1011.52,"grnd_level":920.9,"humidity":94,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"多云","icon":"04d"}],"clouds":{"all":76},"wind":{"speed":1.07,"deg":108.003},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-04 00:00:00"},{"dt":1551668400,"main":{"temp":9.41,"temp_min":9.41,"temp_max":9.41,"pressure":1010.85,"sea_level":1010.85,"grnd_level":921.31,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":56},"wind":{"speed":1.41,"deg":119.003},"rain":{"3h":0.015},"sys":{"pod":"d"},"dt_txt":"2019-03-04 03:00:00"},{"dt":1551679200,"main":{"temp":13.83,"temp_min":13.83,"temp_max":13.83,"pressure":1007.6,"sea_level":1007.6,"grnd_level":918.86,"humidity":74,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":80},"wind":{"speed":1.4,"deg":97.5061},"rain":{"3h":0.025},"sys":{"pod":"d"},"dt_txt":"2019-03-04 06:00:00"},{"dt":1551690000,"main":{"temp":13.92,"temp_min":13.92,"temp_max":13.92,"pressure":1006.43,"sea_level":1006.43,"grnd_level":917.8,"humidity":74,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.67,"deg":69.5004},"rain":{"3h":0.03},"sys":{"pod":"d"},"dt_txt":"2019-03-04 09:00:00"},{"dt":1551700800,"main":{"temp":9.67,"temp_min":9.67,"temp_max":9.67,"pressure":1008.65,"sea_level":1008.65,"grnd_level":919.51,"humidity":91,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":24},"wind":{"speed":0.16,"deg":95.0012},"rain":{"3h":0.05},"sys":{"pod":"n"},"dt_txt":"2019-03-04 12:00:00"},{"dt":1551711600,"main":{"temp":7.46,"temp_min":7.46,"temp_max":7.46,"pressure":1010.78,"sea_level":1010.78,"grnd_level":921.27,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":68},"wind":{"speed":1.22,"deg":167.5},"rain":{"3h":0.46},"sys":{"pod":"n"},"dt_txt":"2019-03-04 15:00:00"},{"dt":1551722400,"main":{"temp":7.5,"temp_min":7.5,"temp_max":7.5,"pressure":1011.32,"sea_level":1011.32,"grnd_level":921.66,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.31,"deg":147.502},"rain":{"3h":1.4},"sys":{"pod":"n"},"dt_txt":"2019-03-04 18:00:00"},{"dt":1551733200,"main":{"temp":7.78,"temp_min":7.78,"temp_max":7.78,"pressure":1011.31,"sea_level":1011.31,"grnd_level":921.5,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.63,"deg":181.501},"rain":{"3h":1.95},"sys":{"pod":"n"},"dt_txt":"2019-03-04 21:00:00"},{"dt":1551744000,"main":{"temp":7.94,"temp_min":7.94,"temp_max":7.94,"pressure":1013.2,"sea_level":1013.2,"grnd_level":923.15,"humidity":100,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"中雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.16,"deg":190.502},"rain":{"3h":3.63},"sys":{"pod":"d"},"dt_txt":"2019-03-05 00:00:00"},{"dt":1551754800,"main":{"temp":9.13,"temp_min":9.13,"temp_max":9.13,"pressure":1014.64,"sea_level":1014.64,"grnd_level":925.18,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.47,"deg":215.002},"rain":{"3h":2.2},"sys":{"pod":"d"},"dt_txt":"2019-03-05 03:00:00"},{"dt":1551765600,"main":{"temp":9.86,"temp_min":9.86,"temp_max":9.86,"pressure":1013.95,"sea_level":1013.95,"grnd_level":924.77,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.27,"deg":309.001},"rain":{"3h":1.45},"sys":{"pod":"d"},"dt_txt":"2019-03-05 06:00:00"},{"dt":1551776400,"main":{"temp":9.64,"temp_min":9.64,"temp_max":9.64,"pressure":1013.8,"sea_level":1013.8,"grnd_level":924.74,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.28,"deg":317.004},"rain":{"3h":0.49},"sys":{"pod":"d"},"dt_txt":"2019-03-05 09:00:00"},{"dt":1551787200,"main":{"temp":9.04,"temp_min":9.04,"temp_max":9.04,"pressure":1016.17,"sea_level":1016.17,"grnd_level":926.42,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.16,"deg":351.003},"rain":{"3h":0.77},"sys":{"pod":"n"},"dt_txt":"2019-03-05 12:00:00"},{"dt":1551798000,"main":{"temp":8.81,"temp_min":8.81,"temp_max":8.81,"pressure":1018.48,"sea_level":1018.48,"grnd_level":928.35,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":1.06,"deg":22.0003},"rain":{"3h":0.71},"sys":{"pod":"n"},"dt_txt":"2019-03-05 15:00:00"},{"dt":1551808800,"main":{"temp":8.65,"temp_min":8.65,"temp_max":8.65,"pressure":1018.84,"sea_level":1018.84,"grnd_level":928.48,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":1.11,"deg":47.0001},"rain":{"3h":0.75},"sys":{"pod":"n"},"dt_txt":"2019-03-05 18:00:00"},{"dt":1551819600,"main":{"temp":8.28,"temp_min":8.28,"temp_max":8.28,"pressure":1018.23,"sea_level":1018.23,"grnd_level":927.63,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.16,"deg":98.0016},"rain":{"3h":0.82},"sys":{"pod":"n"},"dt_txt":"2019-03-05 21:00:00"},{"dt":1551830400,"main":{"temp":8.23,"temp_min":8.23,"temp_max":8.23,"pressure":1019.53,"sea_level":1019.53,"grnd_level":928.55,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.97,"deg":87.5132},"rain":{"3h":0.43},"sys":{"pod":"d"},"dt_txt":"2019-03-06 00:00:00"},{"dt":1551841200,"main":{"temp":9.78,"temp_min":9.78,"temp_max":9.78,"pressure":1020.51,"sea_level":1020.51,"grnd_level":930.26,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.47,"deg":88.5002},"rain":{"3h":0.87},"sys":{"pod":"d"},"dt_txt":"2019-03-06 03:00:00"},{"dt":1551852000,"main":{"temp":10.24,"temp_min":10.24,"temp_max":10.24,"pressure":1019.04,"sea_level":1019.04,"grnd_level":929.2,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.87,"deg":183.002},"rain":{"3h":0.74},"sys":{"pod":"d"},"dt_txt":"2019-03-06 06:00:00"},{"dt":1551862800,"main":{"temp":9.38,"temp_min":9.38,"temp_max":9.38,"pressure":1018.04,"sea_level":1018.04,"grnd_level":928.2,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.26,"deg":135.001},"rain":{"3h":1.37},"sys":{"pod":"d"},"dt_txt":"2019-03-06 09:00:00"},{"dt":1551873600,"main":{"temp":7.93,"temp_min":7.93,"temp_max":7.93,"pressure":1019.57,"sea_level":1019.57,"grnd_level":929.27,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.06,"deg":117.001},"rain":{"3h":0.4},"sys":{"pod":"n"},"dt_txt":"2019-03-06 12:00:00"},{"dt":1551884400,"main":{"temp":6.96,"temp_min":6.96,"temp_max":6.96,"pressure":1020.98,"sea_level":1020.98,"grnd_level":930.19,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":2.31,"deg":118.505},"rain":{"3h":0.030000000000001},"sys":{"pod":"n"},"dt_txt":"2019-03-06 15:00:00"},{"dt":1551895200,"main":{"temp":6.09,"temp_min":6.09,"temp_max":6.09,"pressure":1021.82,"sea_level":1021.82,"grnd_level":930.67,"humidity":94,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.52,"deg":128.503},"rain":{"3h":0.16},"sys":{"pod":"n"},"dt_txt":"2019-03-06 18:00:00"},{"dt":1551906000,"main":{"temp":5.67,"temp_min":5.67,"temp_max":5.67,"pressure":1020.97,"sea_level":1020.97,"grnd_level":929.63,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.72,"deg":123.006},"rain":{"3h":0.26},"sys":{"pod":"n"},"dt_txt":"2019-03-06 21:00:00"},{"dt":1551916800,"main":{"temp":5.31,"temp_min":5.31,"temp_max":5.31,"pressure":1022.11,"sea_level":1022.11,"grnd_level":930.42,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.91,"deg":119.004},"rain":{"3h":0.09},"sys":{"pod":"d"},"dt_txt":"2019-03-07 00:00:00"},{"dt":1551927600,"main":{"temp":6.53,"temp_min":6.53,"temp_max":6.53,"pressure":1022.7,"sea_level":1022.7,"grnd_level":931.46,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":2.66,"deg":116.5},"rain":{"3h":0.080000000000002},"sys":{"pod":"d"},"dt_txt":"2019-03-07 03:00:00"},{"dt":1551938400,"main":{"temp":7.42,"temp_min":7.42,"temp_max":7.42,"pressure":1020.49,"sea_level":1020.49,"grnd_level":929.77,"humidity":92,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.42,"deg":121.508},"rain":{"3h":0.039999999999999},"sys":{"pod":"d"},"dt_txt":"2019-03-07 06:00:00"},{"dt":1551949200,"main":{"temp":6.89,"temp_min":6.89,"temp_max":6.89,"pressure":1018.54,"sea_level":1018.54,"grnd_level":927.99,"humidity":86,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":2.31,"deg":118.004},"rain":{"3h":0.050000000000001},"sys":{"pod":"d"},"dt_txt":"2019-03-07 09:00:00"},{"dt":1551960000,"main":{"temp":5.47,"temp_min":5.47,"temp_max":5.47,"pressure":1019.04,"sea_level":1019.04,"grnd_level":927.91,"humidity":79,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":80},"wind":{"speed":2.01,"deg":117.001},"rain":{"3h":0.009999999999998},"sys":{"pod":"n"},"dt_txt":"2019-03-07 12:00:00"},{"dt":1551970800,"main":{"temp":4.84,"temp_min":4.84,"temp_max":4.84,"pressure":1020.06,"sea_level":1020.06,"grnd_level":928.62,"humidity":79,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.49,"deg":116.001},"rain":{"3h":0.050000000000001},"sys":{"pod":"n"},"dt_txt":"2019-03-07 15:00:00"},{"dt":1551981600,"main":{"temp":4.02,"temp_min":4.02,"temp_max":4.02,"pressure":1019.55,"sea_level":1019.55,"grnd_level":927.91,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.13,"deg":115.001},"rain":{"3h":0.15},"snow":{"3h":0.205},"sys":{"pod":"n"},"dt_txt":"2019-03-07 18:00:00"},{"dt":1551992400,"main":{"temp":3.37,"temp_min":3.37,"temp_max":3.37,"pressure":1018.21,"sea_level":1018.21,"grnd_level":926.34,"humidity":91,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":1.16,"deg":127.003},"rain":{"3h":0.15},"snow":{"3h":0.245},"sys":{"pod":"n"},"dt_txt":"2019-03-07 21:00:00"},{"dt":1552003200,"main":{"temp":3.36,"temp_min":3.36,"temp_max":3.36,"pressure":1018.52,"sea_level":1018.52,"grnd_level":926.59,"humidity":91,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":1.42,"deg":118.005},"rain":{"3h":0.039999999999999},"snow":{"3h":0.055},"sys":{"pod":"d"},"dt_txt":"2019-03-08 00:00:00"},{"dt":1552014000,"main":{"temp":6.03,"temp_min":6.03,"temp_max":6.03,"pressure":1018.27,"sea_level":1018.27,"grnd_level":927.19,"humidity":88,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":80},"wind":{"speed":1.47,"deg":124.501},"rain":{"3h":0.010000000000002},"snow":{},"sys":{"pod":"d"},"dt_txt":"2019-03-08 03:00:00"},{"dt":1552024800,"main":{"temp":8.73,"temp_min":8.73,"temp_max":8.73,"pressure":1015.98,"sea_level":1015.98,"grnd_level":925.54,"humidity":78,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"多云","icon":"04d"}],"clouds":{"all":80},"wind":{"speed":1.32,"deg":245.001},"rain":{},"snow":{},"sys":{"pod":"d"},"dt_txt":"2019-03-08 06:00:00"}]
     * city : {"id":1814905,"name":"Chongqing Shi","coord":{"lat":30.25,"lon":107.75},"country":"CN"}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 1814905
         * name : Chongqing Shi
         * coord : {"lat":30.25,"lon":107.75}
         * country : CN
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public static class CoordBean {
            /**
             * lat : 30.25
             * lon : 107.75
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1551603600
         * main : {"temp":14.6,"temp_min":13.76,"temp_max":14.6,"pressure":1010.53,"sea_level":1010.53,"grnd_level":922.13,"humidity":67,"temp_kf":0.84}
         * weather : [{"id":800,"main":"Clear","description":"晴","icon":"01d"}]
         * clouds : {"all":0}
         * wind : {"speed":0.56,"deg":351.5}
         * rain : {}
         * sys : {"pod":"d"}
         * dt_txt : 2019-03-03 09:00:00
         * snow : {"3h":0.205}
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private RainBean rain;
        private SysBean sys;
        private String dt_txt;
        private SnowBean snow;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public SnowBean getSnow() {
            return snow;
        }

        public void setSnow(SnowBean snow) {
            this.snow = snow;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 14.6
             * temp_min : 13.76
             * temp_max : 14.6
             * pressure : 1010.53
             * sea_level : 1010.53
             * grnd_level : 922.13
             * humidity : 67
             * temp_kf : 0.84
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 0
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 0.56
             * deg : 351.5
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class RainBean {
        }

        public static class SysBean {
            /**
             * pod : d
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class SnowBean {
            /**
             * 3h : 0.205
             */

           @com.google.gson.annotations.SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class WeatherBean {
            /**
             * id : 800
             * main : Clear
             * description : 晴
             * icon : 01d
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
