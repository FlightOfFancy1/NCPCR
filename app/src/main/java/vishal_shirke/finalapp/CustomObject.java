package vishal_shirke.finalapp;

/**
 * Created by atul on 29-03-2017.
 */

public class CustomObject {
    String percentage;
    String parameter;

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    CustomObject(String percentage, String parameter){
        this.percentage=percentage;
        this.parameter=parameter;
    }
}
