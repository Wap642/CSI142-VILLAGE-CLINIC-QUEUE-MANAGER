package com.clinic.queue;

public class QueueEntry{

    private PatientBase patient;
    private int queueNumber;

    public QueueEntry(PatientBase patient, int queueNumber){
        this.patient = patient;
        this.queueNumber = queueNumber;
    }
    public PatientBase getPatient() {
        return patient;
    }
    public int getQueueNumber() {
        return queueNumber;

    }
}
