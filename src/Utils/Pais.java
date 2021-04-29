package Utils;

public class Pais {
    private String Country_name;
    private String Regional_indicator;
    private double Social_support;
    private double Healthy_life_expectancy;
    private double Freedom_to_make_life_choices;
    private double Generosity;
    private double Perceptions_of_corruption;

    public Pais(String country_name, String regional_indicator, double social_support, double healthy_life_expectancy, double freedom_to_make_life_choices, double generosity, double perceptions_of_corruption) {
        Country_name = country_name;
        Regional_indicator = regional_indicator;
        Social_support = social_support;
        Healthy_life_expectancy = healthy_life_expectancy;
        Freedom_to_make_life_choices = freedom_to_make_life_choices;
        Generosity = generosity;
        Perceptions_of_corruption = perceptions_of_corruption;
    }

    public String getCountry_name() {
        return Country_name;
    }

    public void setCountry_name(String country_name) {
        Country_name = country_name;
    }

    public String getRegional_indicator() {
        return Regional_indicator;
    }

    public void setRegional_indicator(String regional_indicator) {
        Regional_indicator = regional_indicator;
    }

    public double getSocial_support() {
        return Social_support;
    }

    public void setSocial_support(double social_support) {
        Social_support = social_support;
    }

    public double getHealthy_life_expectancy() {
        return Healthy_life_expectancy;
    }

    public void setHealthy_life_expectancy(double healthy_life_expectancy) {
        Healthy_life_expectancy = healthy_life_expectancy;
    }

    public double getFreedom_to_make_life_choices() {
        return Freedom_to_make_life_choices;
    }

    public void setFreedom_to_make_life_choices(double freedom_to_make_life_choices) {
        Freedom_to_make_life_choices = freedom_to_make_life_choices;
    }

    public double getGenerosity() {
        return Generosity;
    }

    public void setGenerosity(double generosity) {
        Generosity = generosity;
    }

    public double getPerceptions_of_corruption() {
        return Perceptions_of_corruption;
    }

    public void setPerceptions_of_corruption(double perceptions_of_corruption) {
        Perceptions_of_corruption = perceptions_of_corruption;
    }
}
