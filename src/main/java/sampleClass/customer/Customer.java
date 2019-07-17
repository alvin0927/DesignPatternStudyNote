package sampleClass.customer;

import java.util.Date;

public class Customer {
    /** 顧客編號 */
    private int customerNo;
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

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
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
}
