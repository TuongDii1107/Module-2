package set;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private  double diem;

    public Student() {
    }

    public Student(int id, String name, double diem) {
        this.id = id;
        this.name = name;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int compareTo (Student o){
        /**
         * = 0: hai phần tử giống nhau
         * < 0: phân tử trước lớn hơn phần tử sau =>hoán vị
         * >0: phần tử sau lớn hơn phần tử trước  => không cần hoasn vị
         */
        /*
        sắp xếp theo điểm
         */
        int diemCompare = Double.compare(this.diem , o.diem);
        if(diemCompare != 0){
            return diemCompare; // điểm khác nhau rồi => cứ sắp xếp bình thường
        }
        // điểm giống nhau => so sanhs theo tên
        return this.name.compareTo(o.name);
        //điểm giống nhau thì sắp xếp theo tên
    }
}
