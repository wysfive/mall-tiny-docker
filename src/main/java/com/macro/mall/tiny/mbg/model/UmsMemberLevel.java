package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class UmsMemberLevel implements Serializable {
    private Long id;

    private String name;

    private Integer growthPoint;

    @ApiModelProperty(value = "æ˜¯å¦ä¸ºé»˜è®¤ç­‰çº§ï¼š0->ä¸æ˜¯ï¼›1->æ˜¯")
    private Integer defaultStatus;

    @ApiModelProperty(value = "å…è¿è´¹æ ‡å‡†")
    private BigDecimal freeFreightPoint;

    @ApiModelProperty(value = "æ¯æ¬¡è¯„ä»·èŽ·å–çš„æˆé•¿å€¼")
    private Integer commentGrowthPoint;

    @ApiModelProperty(value = "æ˜¯å¦æœ‰å…é‚®ç‰¹æƒ")
    private Integer priviledgeFreeFreight;

    @ApiModelProperty(value = "æ˜¯å¦æœ‰ç­¾åˆ°ç‰¹æƒ")
    private Integer priviledgeSignIn;

    @ApiModelProperty(value = "æ˜¯å¦æœ‰è¯„è®ºèŽ·å¥–åŠ±ç‰¹æƒ")
    private Integer priviledgeComment;

    @ApiModelProperty(value = "æ˜¯å¦æœ‰ä¸“äº«æ´»åŠ¨ç‰¹æƒ")
    private Integer priviledgePromotion;

    @ApiModelProperty(value = "æ˜¯å¦æœ‰ä¼šå‘˜ä»·æ ¼ç‰¹æƒ")
    private Integer priviledgeMemberPrice;

    @ApiModelProperty(value = "æ˜¯å¦æœ‰ç”Ÿæ—¥ç‰¹æƒ")
    private Integer priviledgeBirthday;

    private String note;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", growthPoint=").append(growthPoint);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", freeFreightPoint=").append(freeFreightPoint);
        sb.append(", commentGrowthPoint=").append(commentGrowthPoint);
        sb.append(", priviledgeFreeFreight=").append(priviledgeFreeFreight);
        sb.append(", priviledgeSignIn=").append(priviledgeSignIn);
        sb.append(", priviledgeComment=").append(priviledgeComment);
        sb.append(", priviledgePromotion=").append(priviledgePromotion);
        sb.append(", priviledgeMemberPrice=").append(priviledgeMemberPrice);
        sb.append(", priviledgeBirthday=").append(priviledgeBirthday);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}