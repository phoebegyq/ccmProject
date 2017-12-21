package com.siemens.ccmservice.entity;

import java.util.Date;

public class VPPMBean {

    //Complaint Section
    private String SourceID;

    private String SourceDesc;

    private String ComplaintNumber;

    private Date ComplaintCreateDate;

    private Long CustomerNumber;

    private String CustomerDesc;

    private String CustomerPlant;

    private String CustomerProvince;

    //--Part Section
    private String PartType;

    private String PartDesc;

    private String CustomerPartNumber;

    private String InternalPartNumber;

    private String BU;

    private String PlatForm;

    private String ProductionLine;

    private String CustomerInfo1;

    private String CustomerInfo2;

    private String CustomerInfo3;

    //
    private String ComplaintQuantity;

    private Date CustomerComplaintDate;

    private Date ProductionDate;

    //--Defect Section
    private String InternalDefectCode;

    private String InternalDefectDesc;

    private String CustomerDefectCode;

    private String CustomerDefectDesc;

    private String DefectSubGroupCode;

    private String DefectSubGroupDESC;

    private String DefectCategoryCode;

    private String DefectCategoryDesc;

    private String DefectLevelCode;

    private String DefectRepeatYN;

    private String ResponsibleDeptNumber;

    private String ResponsibleDeptDESC;

    private String ResponsibleSupplierCode;

    private String ResponsibleSupplierDesc;

    public VPPMBean() {
    }

    public String getSourceID() {
        return SourceID;
    }

    public void setSourceID(String sourceID) {
        SourceID = sourceID;
    }

    public String getSourceDesc() {
        return SourceDesc;
    }

    public void setSourceDesc(String sourceDesc) {
        SourceDesc = sourceDesc;
    }

    public String getComplaintNumber() {
        return ComplaintNumber;
    }

    public void setComplaintNumber(String complaintNumber) {
        ComplaintNumber = complaintNumber;
    }

    public Date getComplaintCreateDate() {
        return ComplaintCreateDate;
    }

    public void setComplaintCreateDate(Date complaintCreateDate) {
        ComplaintCreateDate = complaintCreateDate;
    }

    public Long getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        CustomerNumber = customerNumber;
    }

    public String getCustomerDesc() {
        return CustomerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        CustomerDesc = customerDesc;
    }

    public String getCustomerPlant() {
        return CustomerPlant;
    }

    public void setCustomerPlant(String customerPlant) {
        CustomerPlant = customerPlant;
    }

    public String getCustomerProvince() {
        return CustomerProvince;
    }

    public void setCustomerProvince(String customerProvince) {
        CustomerProvince = customerProvince;
    }

    public String getPartType() {
        return PartType;
    }

    public void setPartType(String partType) {
        PartType = partType;
    }

    public String getPartDesc() {
        return PartDesc;
    }

    public void setPartDesc(String partDesc) {
        PartDesc = partDesc;
    }

    public String getCustomerPartNumber() {
        return CustomerPartNumber;
    }

    public void setCustomerPartNumber(String customerPartNumber) {
        CustomerPartNumber = customerPartNumber;
    }

    public String getInternalPartNumber() {
        return InternalPartNumber;
    }

    public void setInternalPartNumber(String internalPartNumber) {
        InternalPartNumber = internalPartNumber;
    }

    public String getBU() {
        return BU;
    }

    public void setBU(String BU) {
        this.BU = BU;
    }

    public String getPlatForm() {
        return PlatForm;
    }

    public void setPlatForm(String platForm) {
        PlatForm = platForm;
    }

    public String getProductionLine() {
        return ProductionLine;
    }

    public void setProductionLine(String productionLine) {
        ProductionLine = productionLine;
    }

    public String getCustomerInfo1() {
        return CustomerInfo1;
    }

    public void setCustomerInfo1(String customerInfo1) {
        CustomerInfo1 = customerInfo1;
    }

    public String getCustomerInfo2() {
        return CustomerInfo2;
    }

    public void setCustomerInfo2(String customerInfo2) {
        CustomerInfo2 = customerInfo2;
    }

    public String getCustomerInfo3() {
        return CustomerInfo3;
    }

    public void setCustomerInfo3(String customerInfo3) {
        CustomerInfo3 = customerInfo3;
    }

    public String getComplaintQuantity() {
        return ComplaintQuantity;
    }

    public void setComplaintQuantity(String complaintQuantity) {
        ComplaintQuantity = complaintQuantity;
    }

    public Date getCustomerComplaintDate() {
        return CustomerComplaintDate;
    }

    public void setCustomerComplaintDate(Date customerComplaintDate) {
        CustomerComplaintDate = customerComplaintDate;
    }

    public Date getProductionDate() {
        return ProductionDate;
    }

    public void setProductionDate(Date productionDate) {
        ProductionDate = productionDate;
    }

    public String getInternalDefectCode() {
        return InternalDefectCode;
    }

    public void setInternalDefectCode(String internalDefectCode) {
        InternalDefectCode = internalDefectCode;
    }

    public String getInternalDefectDesc() {
        return InternalDefectDesc;
    }

    public void setInternalDefectDesc(String internalDefectDesc) {
        InternalDefectDesc = internalDefectDesc;
    }

    public String getCustomerDefectCode() {
        return CustomerDefectCode;
    }

    public void setCustomerDefectCode(String customerDefectCode) {
        CustomerDefectCode = customerDefectCode;
    }

    public String getCustomerDefectDesc() {
        return CustomerDefectDesc;
    }

    public void setCustomerDefectDesc(String customerDefectDesc) {
        CustomerDefectDesc = customerDefectDesc;
    }

    public String getDefectSubGroupCode() {
        return DefectSubGroupCode;
    }

    public void setDefectSubGroupCode(String defectSubGroupCode) {
        DefectSubGroupCode = defectSubGroupCode;
    }

    public String getDefectSubGroupDESC() {
        return DefectSubGroupDESC;
    }

    public void setDefectSubGroupDESC(String defectSubGroupDESC) {
        DefectSubGroupDESC = defectSubGroupDESC;
    }

    public String getDefectCategoryCode() {
        return DefectCategoryCode;
    }

    public void setDefectCategoryCode(String defectCategoryCode) {
        DefectCategoryCode = defectCategoryCode;
    }

    public String getDefectCategoryDesc() {
        return DefectCategoryDesc;
    }

    public void setDefectCategoryDesc(String defectCategoryDesc) {
        DefectCategoryDesc = defectCategoryDesc;
    }

    public String getDefectLevelCode() {
        return DefectLevelCode;
    }

    public void setDefectLevelCode(String defectLevelCode) {
        DefectLevelCode = defectLevelCode;
    }

    public String getDefectRepeatYN() {
        return DefectRepeatYN;
    }

    public void setDefectRepeatYN(String defectRepeatYN) {
        DefectRepeatYN = defectRepeatYN;
    }

    public String getResponsibleDeptNumber() {
        return ResponsibleDeptNumber;
    }

    public void setResponsibleDeptNumber(String responsibleDeptNumber) {
        ResponsibleDeptNumber = responsibleDeptNumber;
    }

    public String getResponsibleDeptDESC() {
        return ResponsibleDeptDESC;
    }

    public void setResponsibleDeptDESC(String responsibleDeptDESC) {
        ResponsibleDeptDESC = responsibleDeptDESC;
    }

    public String getResponsibleSupplierCode() {
        return ResponsibleSupplierCode;
    }

    public void setResponsibleSupplierCode(String responsibleSupplierCode) {
        ResponsibleSupplierCode = responsibleSupplierCode;
    }

    public String getResponsibleSupplierDesc() {
        return ResponsibleSupplierDesc;
    }

    public void setResponsibleSupplierDesc(String responsibleSupplierDesc) {
        ResponsibleSupplierDesc = responsibleSupplierDesc;
    }

    @Override
    public String toString() {
        return "PPMBean{" +
                "SourceID='" + SourceID + '\'' +
                ", SourceDesc='" + SourceDesc + '\'' +
                ", ComplaintNumber='" + ComplaintNumber + '\'' +
                ", ComplaintCreateDate=" + ComplaintCreateDate +
                ", CustomerNumber=" + CustomerNumber +
                ", CustomerDesc='" + CustomerDesc + '\'' +
                ", CustomerPlant='" + CustomerPlant + '\'' +
                ", CustomerProvince='" + CustomerProvince + '\'' +
                ", PartType='" + PartType + '\'' +
                ", PartDesc='" + PartDesc + '\'' +
                ", CustomerPartNumber='" + CustomerPartNumber + '\'' +
                ", InternalPartNumber='" + InternalPartNumber + '\'' +
                ", BU='" + BU + '\'' +
                ", PlatForm='" + PlatForm + '\'' +
                ", ProductionLine='" + ProductionLine + '\'' +
                ", CustomerInfo1='" + CustomerInfo1 + '\'' +
                ", CustomerInfo2='" + CustomerInfo2 + '\'' +
                ", CustomerInfo3='" + CustomerInfo3 + '\'' +
                ", ComplaintQuantity='" + ComplaintQuantity + '\'' +
                ", CustomerComplaintDate=" + CustomerComplaintDate +
                ", ProductionDate=" + ProductionDate +
                ", InternalDefectCode='" + InternalDefectCode + '\'' +
                ", InternalDefectDesc='" + InternalDefectDesc + '\'' +
                ", CustomerDefectCode='" + CustomerDefectCode + '\'' +
                ", CustomerDefectDesc='" + CustomerDefectDesc + '\'' +
                ", DefectSubGroupCode='" + DefectSubGroupCode + '\'' +
                ", DefectSubGroupDESC='" + DefectSubGroupDESC + '\'' +
                ", DefectCategoryCode='" + DefectCategoryCode + '\'' +
                ", DefectCategoryDesc='" + DefectCategoryDesc + '\'' +
                ", DefectLevelCode='" + DefectLevelCode + '\'' +
                ", DefectRepeatYN='" + DefectRepeatYN + '\'' +
                ", ResponsibleDeptNumber='" + ResponsibleDeptNumber + '\'' +
                ", ResponsibleDeptDESC='" + ResponsibleDeptDESC + '\'' +
                ", ResponsibleSupplierCode='" + ResponsibleSupplierCode + '\'' +
                ", ResponsibleSupplierDesc='" + ResponsibleSupplierDesc + '\'' +
                '}';
    }
}