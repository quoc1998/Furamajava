
public class Swimming {
    private String Time="10:00";

    public Swimming() {
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
    public String businessBours(String time){
      if(time.compareTo( this.Time )<0){
          return "da mo cua";
    }else {
        return "chờ đến 10h";
    }
    }
    public void CalculateTheDate(int day){
        switch (day)
        {
            case 100:
                System.out.println( "10 ngay" );
                break;
            case 50:
                System.out.println( "5 ngay" );
                break;
            case 30:
                System.out.println( "3 ngay" );
                break;

        }


    }

}
