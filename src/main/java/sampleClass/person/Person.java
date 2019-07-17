package sampleClass.person;

import java.util.Date;

public class Person {
    /** maybe is DB primary key id */
    private int id;
    /** 身分證 */
    private String licenseId;
    /** 姓名 */
    private String name;
    /** 性別 */
    private String gender;
    /** 年齡 */
    private int age;
    /** 地址　*/
    private String address;
    /** 電子郵件 */
    private String email;
    /** 生日 */
    private Date birthday;
    /** 電話號碼 */
    private String telephoneNumber;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public static Person getInstance() {
        Person person = new Person();
        int id = (int) (System.currentTimeMillis() / 1000);
        person.setId(id);
        person.setName("name:" + id);
        person.setAge((int)(Math.random() * 60) + 20);
        person.setAddress("address:" + id);
        person.setLicenseId("" + id);
        person.setBirthday(new Date());
        person.setEmail("mail." + id + "@gmail.com");
        person.setTelephoneNumber("0987654321");
        person.setGender(person.getAge() % 2 == 0 ? "male" : "female");
        return person;
    }
}
