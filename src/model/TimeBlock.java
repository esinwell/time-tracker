package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TimeBlock {

  private LocalDateTime startTime;
  private LocalDateTime endTime;
  //only 1 project per timeblock?
  private Project myProject;

  public TimeBlock(LocalDateTime start, LocalDateTime end, Project project) {
    startTime = start;
    endTime = end;
    myProject = project;
  }


  public LocalDateTime startTime() {
    return startTime;
  }
  public void setStartTime(LocalDateTime startTime) {
    this.startTime = startTime;
  }

  public LocalDateTime endTime() {
    return endTime;
  }
  public void setEndTime(LocalDateTime endTime) {
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
