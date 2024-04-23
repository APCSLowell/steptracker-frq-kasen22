import java.util.ArrayList;
public class StepTracker
{
private int minSteps, totalSteps, totalDays, actDays;
public StepTracker(int goal){
 minSteps = goal;
 totalSteps = 0;
 totalDays = 0;
 actDays = 0;
}
public void addDailySteps (int Steps){
 totalSteps = totalSteps + Steps;
 totalDays ++;
 if (Steps >= minSteps){
  actDays++;
 }
}
 public int activeDays (){
  return actDays;
 }
 public double averageSteps(){
  if(totalDays == 0){
   return 0.0;
  }else{
   return (double)totalSteps/totalDays;
  }
}
}
