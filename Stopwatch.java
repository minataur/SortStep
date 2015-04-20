
public class Stopwatch {
  private long start;
  private long stop;
  private long elapsed;
  public void start()
    /* begins keeping track of time */
  {
    start=System.nanoTime();
  }
  public void stop()
    /* stops keeping track of time */
  {
    stop=System.nanoTime();
    
  }
  public long elapsedTime()
    /* uses System.out to display the elapsed time in seconds */
  {
    elapsed=stop-start;
    return elapsed;
  }
  public void reset()
    /* resets the elapsed time to 0 */
  {
    elapsed=0L;
  }
}

