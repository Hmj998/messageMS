package entity;

import java.util.Date;

public class MessageBean {
    private long id;
    private String mcontent;
    private Date pulish;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public Date getPulish() {
        return pulish;
    }

    public void setPulish(Date pulish) {
        this.pulish = pulish;
    }

    public MessageBean() {

    }

    public MessageBean(String mcontent, Date pulish) {
        this.mcontent = mcontent;
        this.pulish = pulish;
    }
}
