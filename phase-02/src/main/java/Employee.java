import java.time.LocalDateTime;
import java.util.ArrayList;

public class Employee {

    public static ArrayList<Employee> employees = new ArrayList<>();
    private int id;
    private String name;
    private String email;
    private String password;
    private String about;
    private String token;
    private String country;
    private String location;
    private int lng;
    private int lat;
    private String dob;
    private int gender;
    private int userType;
    private int userStatus;
    private String profilePicture;
    private String coverPicture;
    private boolean enablefollowme;
    private boolean sendmenotifications;
    private boolean sendTextmessages;
    private boolean enabletagging;
    private String createdAt;
    private String updatedAt;
    private double livelng;
    private double livelat;
    private String liveLocation;
    private int creditBalance;
    private int myCash;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setCoverPicture(String coverPicture) {
        this.coverPicture = coverPicture;
    }

    public void setEnablefollowme(boolean enablefollowme) {
        this.enablefollowme = enablefollowme;
    }

    public void setSendmenotifications(boolean sendmenotifications) {
        this.sendmenotifications = sendmenotifications;
    }

    public void setSendTextmessages(boolean sendTextmessages) {
        this.sendTextmessages = sendTextmessages;
    }

    public void setEnabletagging(boolean enabletagging) {
        this.enabletagging = enabletagging;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public static void setEmployees(ArrayList<Employee> employees) {
        Employee.employees = employees;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setLivelng(double livelng) {
        this.livelng = livelng;
    }

    public void setLivelat(double livelat) {
        this.livelat = livelat;
    }

    public void setLiveLocation(String liveLocation) {
        this.liveLocation = liveLocation;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public void setMyCash(int myCash) {
        this.myCash = myCash;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAbout() {
        return about;
    }

    public String getToken() {
        return token;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }

    public int getLng() {
        return lng;
    }

    public int getLat() {
        return lat;
    }

    public String getDob() {
        return dob;
    }

    public int getGender() {
        return gender;
    }

    public int getUserType() {
        return userType;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getCoverPicture() {
        return coverPicture;
    }

    public boolean isEnablefollowme() {
        return enablefollowme;
    }

    public boolean isSendmenotifications() {
        return sendmenotifications;
    }

    public boolean isSendTextmessages() {
        return sendTextmessages;
    }

    public boolean isEnabletagging() {
        return enabletagging;
    }

    public double getLivelng() {
        return livelng;
    }

    public double getLivelat() {
        return livelat;
    }

    public String getLiveLocation() {
        return liveLocation;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public int getMyCash() {
        return myCash;
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }
}



