public class Scheduler extends Timetable{
    public void setTimestamp(String name, String time) {
        for(int i = 0; i < courses.size(); i++) {
            if (courses.get(i)[0] == name) {
                courses.set(i, new String[]{name, time});
            }
        }
    }
}
