package com.clinic.queue;

public class QueueEntry{

    private Patient patient;
    private int queueNumber;

    public QueueEntry(Patient patient, int queueNumber){
        this.patient = patient;
        this.queueNumber = queueNumber;
    }
    public Patient getPatient() {
        return patient;
    }
    public int getQueueNumber() {
        return queueNumber;

    }
}
