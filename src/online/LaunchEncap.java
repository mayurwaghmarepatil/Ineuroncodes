package online;
class LaunchEncap {
    private int age;
    private String name;
    private String city;

    void setAge(int age)
    {
        this.age=age;
    }
    int getAge()
    {
        return age;
    }

    void setName(String name)
    {
     this.name=name;
    }
    String getName()
    {
     return name;
    }

    void setCity(String city)
    {
        this.city=city;
    }
    String getCity()
    {
        return city;
    }

    public static void main(String[] args) {
        LaunchEncap cap=new LaunchEncap();
        cap.setAge(22);
        System.out.println("the age of student is "+ cap.getAge());

        cap.setName("mayur waghmare");
        System.out.println("the name of student is "+ cap.getName());

        cap.setCity("Pune");
        System.out.println("i like the "+ cap.getCity()+" city");
    }

}
