package com.intern.irr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="inspection_data")
public class inspectionReport {

    //columns
    @Id
    @Column(name="uuid")
    private String uuid;
    @Column(name="frno")
    private String frNo;
    @Column(name="format_no")
    private String formatNo;
    @Column(name="inspection_and_testing")
    private String inspectionAndTesting;
    @Column(name="safety_devices")
    private String safetyDevices;
    @Column(name="inspection_frequency")
    private String inspectionFrequency;
    @Column(name="test_procedure")
    private String testProcedure;
    @Column(name="test_date")
    private String testDate;
    @Column(name="safety_devices_no")
    private Integer safetyDevicesNo;

    @Column(name="author")
    private String author;
    @Column(name="time_of_report")
    private String timeStamp;
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }



    //No Arg Constructor needed by JPA
    public inspectionReport(){

    }
    public inspectionReport(String frNo, String formatNo, String inspectionAndTesting, String safetyDevices, String inspectionFrequency, String testProcedure, String testDate, Integer safetyDevicesNo, String author) {
        this.uuid = inspectionReport.uuidGenerator();
        this.timeStamp= inspectionReport.timeStampGenerator();
        this.frNo = frNo;
        this.formatNo = formatNo;
        this.inspectionAndTesting = inspectionAndTesting;
        this.safetyDevices = safetyDevices;
        this.inspectionFrequency = inspectionFrequency;
        this.testProcedure = testProcedure;
        this.testDate = testDate;
        this.safetyDevicesNo = safetyDevicesNo;
        this.author= author;
        System.out.println("report generated at:\n"+ inspectionReport.timeStampGenerator());
    }
    //getters and setters for Jackson to convert to JSON

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFrNo() {
        return frNo;
    }

    public void setFrNo(String frNo) {
        this.frNo = frNo;
    }

    public String getFormatNo() {
        return formatNo;
    }

    public void setFormatNo(String formatNo) {
        this.formatNo = formatNo;
    }

    public String getInspectionAndTesting() {
        return inspectionAndTesting;
    }

    public void setInspectionAndTesting(String inspectionAndTesting) {
        this.inspectionAndTesting = inspectionAndTesting;
    }

    public String getSafetyDevices() {
        return safetyDevices;
    }

    public void setSafetyDevices(String safetyDevices) {
        this.safetyDevices = safetyDevices;
    }

    public String getInspectionFrequency() {
        return inspectionFrequency;
    }

    public void setInspectionFrequency(String inspectionFrequency) {
        this.inspectionFrequency = inspectionFrequency;
    }

    public String getTestProcedure() {
        return testProcedure;
    }

    public void setTestProcedure(String testProcedure) {
        this.testProcedure = testProcedure;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public Integer getSafetyDevicesNo() {
        return safetyDevicesNo;
    }

    public void setSafetyDevicesNo(Integer safetyDevicesNo) {
        this.safetyDevicesNo = safetyDevicesNo;
    }

    //Override toString method

    @Override
    public String toString() {
        return "inspectionReport{" +
                "uuid=" + uuid +
                ", frNo='" + frNo + '\'' +
                ", formatNo='" + formatNo + '\'' +
                ", inspectionAndTesting='" + inspectionAndTesting + '\'' +
                ", safetyDevices='" + safetyDevices + '\'' +
                ", inspectionFrequency='" + inspectionFrequency + '\'' +
                ", testProcedure='" + testProcedure + '\'' +
                ", testDate='" + testDate + '\'' +
                ", safetyDevicesNo=" + safetyDevicesNo +
                '}';
    }

    public static String uuidGenerator(){
        UUID x = UUID.randomUUID();
        return x.toString();
    }
    public static String timeStampGenerator(){
        Date x =   new Date();
        SimpleDateFormat y = new SimpleDateFormat("dd/MM/Y HH:mm a");
        return y.format(x);
    }
}
