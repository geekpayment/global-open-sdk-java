package com.alipay.global.api.model.aps;

public class Website {
    private String name;
    private String url;
    private String desc;
    private WebsiteType websiteType;

    public String getName() {
        return name;
    }

    public Website setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Website setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Website setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public WebsiteType getWebsiteType() {
        return websiteType;
    }

    public Website setWebsiteType(WebsiteType websiteType) {
        this.websiteType = websiteType;
        return this;
    }
}
