package vishal_shirke.finalapp;

/**
 * Created by Aditya Joshi on 23/03/2017.
 */

public class items {
        int Darawable = 0;
        String act;

    public items(int darawable,String act)
    {

        Darawable= darawable;
        this.act=act;

    }


    public int getDarawable()
    {
        //passing images through drawable
        return Darawable;

    }
    public String getAct()
    {
        //passing strings
        return act;

    }

    public void setDarawable(int darawable) {

        Darawable = darawable;

    }
}
