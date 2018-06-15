/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
}


