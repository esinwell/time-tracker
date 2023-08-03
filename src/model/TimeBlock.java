package model;



import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import static java.lang.Math.toIntExact;

public class TimeBlock {

  private static final ZonedDateTime BASE_TIME = ZonedDateTime.of(2023, 1, 1, 0, 0, 0, 0, ZoneId.of("UTC"));

  private ZonedDateTime startTime;
  private ZonedDateTime endTime;
  //only 1 project per timeblock?
  private Project myProject;
  //id is the start time's SECONDS from BASE_TIME--stored in an int gives 68 years
  private int id;


  public TimeBlock(ZonedDateTime start, ZonedDateTime end, Project project) {
    startTime = start;
    endTime = end;
    myProject = project;
    makeID();


  }

  private void makeID() {
    Duration dur = Duration.between(BASE_TIME, startTime);
    //unhandled arithmetic exception below: good, shld stop program cuz shldnt happen but maybe deal w this better later
    int sec = toIntExact(dur.getSeconds());
    this.id = sec;
  }

  public ZonedDateTime startTime() {
    return startTime;
  }
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
    makeID();
  }

  public ZonedDateTime endTime() {
    return endTime;
  }
  public void setEndTime(ZonedDateTime endTime) {
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

  public int id() {
    return id;
  }




}
