package com.alipay.global.api.model.aps;

public class Attachment {
    private AttachmentType attachmentType;
    private String attachmentName;
    private String content;
    private String contentType;

    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    public Attachment setAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public Attachment setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Attachment setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public Attachment setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
