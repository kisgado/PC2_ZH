import java.util.ArrayList;

public class Timetable {

    ArrayList<String[]> courses;

    public Timetable() {
        courses = new ArrayList<>();
    }

    public void newCourse(String name) {
        boolean exists = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i)[0] == name) {
                exists = true;
            }
        }
        if (exists == false) {
            courses.add(new String[]{name, ""});
        }
    }

    public void removeCourse(String name) {
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i)[0] == name) {
                courses.remove(i);
            }
        }
    }

    public String getCourses() {
        String output = "";
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i)[1].isEmpty()) {
                output += courses.get(i)[0] + " -";
            } else {
                output += courses.get(i)[0] + " " + courses.get(i)[1];
            }
            if (i < (courses.size()-1)) {
                output += "\r\n";
            }
        }
        return output;
    }
}
