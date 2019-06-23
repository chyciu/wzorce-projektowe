package pl.sdacademy.designpatterns.proxy;

public class DatabaseConfigLoader {

    private String configuration;
    private String serverUrl;

    public DatabaseConfigLoader (final String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String load () {
        System.out.println("Getting confg from "+ serverUrl);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        configuration = "Config load from "+ serverUrl;
        return configuration;
    }

}
