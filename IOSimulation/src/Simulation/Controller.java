package Simulation;

public class Controller {

    /*SIMULATION PARAMETERS*/
    //True if the simulation initial configuration was established
    private boolean configSet = false;
    //Number of times the simulation will be run
    private int repetitions = 0;
    //Total time in seconds to run each simulation (Maximum time)
    private double simulationTime = 0;
    //True if the simulation has to run in slowMode
    private boolean slowMode = false;
    //The number of concurrent connections that the system can handle (k)
    private int concurrentConnections = 0;
    //The number of processes available for the processing of concurrent queries that the system can handle (n)
    private int processingAvailableProcesses = 0;
    //The number of processes available for the execution of transactions (p)
    private int transactionsAvailableProcesses = 0;
    //The number of processes available to execute queries (m)
    private int executionAvailableProcesses = 0;
    //The timeout in seconds of the connections (t)
    private double timeOut = 0;
    //Simulation window
    private SimulationWindow simulationWindow;
    
    /*ToDo puntero a la simulación*/ 

    public boolean getConfigSet() {
        return configSet;
    }

    public void setConfigSet() {
        configSet = true;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public double getSimulationTime() {
        return simulationTime;
    }

    public void setSimulationTime(double simulationTime) {
        this.simulationTime = simulationTime;
    }

    public boolean getSlowMode() {
        return slowMode;
    }

    public void setSlowMode(boolean value) {
        slowMode = value;
    }

    public int getConcurrentConnections() {
        return concurrentConnections;
    }

    public void setConcurrentConnections(int concurrentConnections) {
        this.concurrentConnections = concurrentConnections;
    }

    public int getProcessingAvailableProcesses() {
        return processingAvailableProcesses;
    }

    public void setProcessingAvailableProcesses(int processingAvailableProcesses) {
        this.processingAvailableProcesses = processingAvailableProcesses;
    }

    public int getTransactionsAvailableProcesses() {
        return transactionsAvailableProcesses;
    }

    public void setTransactionsAvailableProcesses(int transactionsAvailableProcesses) {
        this.transactionsAvailableProcesses = transactionsAvailableProcesses;
    }

    public int getExecutionAvailableProcesses() {
        return executionAvailableProcesses;
    }

    public void setExecutionAvailableProcesses(int executionAvailableProcesses) {
        this.executionAvailableProcesses = executionAvailableProcesses;
    }

    public double getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(double timeOut) {
        this.timeOut = timeOut;
    }

    public void startGUI() {
        StartWindow startWindow = new StartWindow();
        startWindow.setController(this);
        startWindow.setVisible(true);
    }

    public void startSimulation() {
        /*ToDo Start the simulation thread*/

        //Start the GUI thread
        this.simulationWindow = new SimulationWindow();
        simulationWindow.setController(this);
        simulationWindow.setVisible(true);
        simulationWindow.simulationThreadStart();
    }
    
    /*Metodo a llamar cada vez que se termine una corrida de la simulación*/
    public void showRunStatsWindow()
    {
        /*ToDo conectar con simulación para obtener parametros con metodos que me den los stast de la corrida o mandarlo por string*/
        RunStatsWindow runStatistics = new RunStatsWindow();
        runStatistics.setVisible(true);
    }
    
    /*Metodo a llamar cuando la simulación terminó todas sus corridas*/
    public void showFinalStatsWindow()
    {
        this.simulationWindow.dispose();
        /*ToDo metodo para establecer los valores que le manda la simulación*/
        FinalStatsWindow finalStatistics = new FinalStatsWindow();
        finalStatistics.setVisible(true);
    }
}
