package ComputerScience;

class Student {
    private String name;
    private int id;
    private String major;
    private String email;
    private String address;
    private String phone;

    public Student(String name, int id, String major, String email, String adress, String phone ) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.email=email;
        this.address=adress;
        this.phone=phone;
        
    }

    // Getter methods

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id=id;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}