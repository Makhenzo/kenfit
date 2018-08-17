public class Testes
{

    int userAge = 60;
    int appAge = 30;

    public int getUserAge() {
        return userAge;
    }

    public int getAppAge() {
        return appAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setAppAge(int appAge) {
        this.appAge = appAge;
    }

    public static void main(String[] args)
    {

        Testes t = new Testes();
       // String out = t.ageStatus(t.setUserAge(60),t.setAppAge(30));
        System.out.println("Out is .." + out );
    }


    public  String  ageStatus(int a, int b)
    {
        String status;

        if(a > b  )
        {
            status = "Older";
        }else
        {
            status = "Younger";
        }

        if(a == b)
        {
            status = "Not older or younger";
        }

        return  status;
    }


}
