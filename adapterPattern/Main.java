public class Main {
    public static void main(String[] args) {
        SchoolManagementApp attendanceApp = new AttendanceSystemAdapter(new AttendanceSystem());
        SchoolManagementApp gradingApp = new GradingSystemAdapter(new GradingSystem());
        SchoolManagementApp libraryApp = new LibrarySystemAdapter(new LibrarySystem());

        attendanceApp.integrateSystem();
        gradingApp.integrateSystem();
        libraryApp.integrateSystem();
    }
}
