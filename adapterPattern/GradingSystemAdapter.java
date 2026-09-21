public class GradingSystemAdapter implements SchoolManagementApp {
    private final GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        if (gradingSystem==null) {
            throw new IllegalArgumentException("Grading System cannot be null.");
        }
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        gradingSystem.recordGrades();
    }
}
