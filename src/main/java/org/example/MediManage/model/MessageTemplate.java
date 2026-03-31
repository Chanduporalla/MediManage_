package org.example.MediManage.model;

public class MessageTemplate {
    private int id;
    private String keyName;
    private String subjectTemplate;
    private String bodyTemplate;

    public MessageTemplate(int id, String keyName, String subjectTemplate, String bodyTemplate) {
        this.id = id;
        this.keyName = keyName;
        this.subjectTemplate = subjectTemplate;
        this.bodyTemplate = bodyTemplate;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getKeyName() { return keyName; }
    public void setKeyName(String keyName) { this.keyName = keyName; }
    
    public String getSubjectTemplate() { return subjectTemplate; }
    public void setSubjectTemplate(String subjectTemplate) { this.subjectTemplate = subjectTemplate; }
    
    public String getBodyTemplate() { return bodyTemplate; }
    public void setBodyTemplate(String bodyTemplate) { this.bodyTemplate = bodyTemplate; }

    public static String render(String template, String customerName, int billId, double totalAmount, String pharmacyName, String careNote) {
        if (template == null) return "";
        return template
                .replace("{{customer_name}}", customerName != null ? customerName : "Valued Customer")
                .replace("{{customerName}}", customerName != null ? customerName : "Valued Customer")
                .replace("{{bill_id}}", String.valueOf(billId))
                .replace("{{billId}}", String.valueOf(billId))
                .replace("{{total_amount}}", String.format("%.2f", totalAmount))
                .replace("{{totalAmount}}", String.format("%.2f", totalAmount))
                .replace("{{pharmacy_name}}", pharmacyName != null ? pharmacyName : "Our Pharmacy")
                .replace("{{pharmacyName}}", pharmacyName != null ? pharmacyName : "Our Pharmacy")
                .replace("{{care_note}}", careNote != null ? careNote : "")
                .replace("{{careNote}}", careNote != null ? careNote : "");
    }
}
