import org.projen.java.JavaProject;
import org.projen.java.JavaProjectOptions;

public class projenrc {
    public static void main(String[] args) {
        JavaProject project = new JavaProject(JavaProjectOptions.builder()
            .artifactId("sla")
            .groupId("org.sla")
            .name("sla")
            .version("0.1.0")
            .build());
        project.synth();
    }
}