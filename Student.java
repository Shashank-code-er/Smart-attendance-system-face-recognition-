package model;

public class Student {
    private int id;
    private String name;
    private String rollNumber;
    private String faceId;

    public Student(int id, String name, String rollNumber, String faceId) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.faceId = faceId;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRollNumber() { return rollNumber; }
    public String getFaceId() { return faceId; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }
    public void setFaceId(String faceId) { this.faceId = faceId; }
}
