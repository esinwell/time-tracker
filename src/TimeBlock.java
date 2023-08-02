import java.sql.Timestamp;

public class TimeBlock {

  private Timestamp startTime;
  private Timestamp endTime;
  //only 1 project per timeblock?
  private Project myProject;

  public TimeBlock(Timestamp start, Timestamp end, Project project) {
    startTime = start;
    endTime = end;
    myProject = project;
  }

  public long calculateTime() {
    return endTime.getTime() - startTime.getTime();
  }


  public Timestamp startTime() {
    return startTime;
  }
  public void setStartTime(Timestamp startTime) {
    this.startTime = startTime;
  }

  public Timestamp endTime() {
    return endTime;
  }
  public void setEndTime(Timestamp endTime) {
    this.endTime = endTime;
  }
  
  public Project projectObj() {
    return myProject;
  }
  public String projectName() {
    return myProject.name();
  }
  public void setProject(Project project) {
    this.myProject = project;
  }


}
