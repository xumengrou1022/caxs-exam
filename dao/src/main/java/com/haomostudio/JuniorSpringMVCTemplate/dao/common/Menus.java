package com.haomostudio.JuniorSpringMVCTemplate.dao.common;

import java.util.Date;


public class Menus {
    private String addOnly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu_associated.delete_only
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String deleteOnly;

    private Integer rank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_permissions.app_url
     *
     * @mbg.generated Tue Jan 02 19:10:18 CST 2018
     */
    private String appUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_permissions.menu_logo
     *
     * @mbg.generated Tue Jan 02 19:10:18 CST 2018
     */
    private String menuLogo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_permissions.link
     *
     * @mbg.generated Tue Jan 02 19:10:18 CST 2018
     */
    private String link;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu_associated.edit_only
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String editOnly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu_associated.type
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu_associated.export_only
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String exportOnly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu_associated.detail_only
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String detailOnly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu_associated.import_only
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String importOnly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_menu_associated.other_only
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String otherOnly;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_menu_associated.id
     *
     * @return the value of role_menu_associated.id
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_permissions.id
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_permissions.name
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_permissions.parent_id
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_permissions.create_time
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_permissions.last_update_time
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_permissions.id
     *
     * @return the value of menu_permissions.id
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_permissions.id
     *
     * @param id the value for menu_permissions.id
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_permissions.name
     *
     * @return the value of menu_permissions.name
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_permissions.name
     *
     * @param name the value for menu_permissions.name
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_permissions.parent_id
     *
     * @return the value of menu_permissions.parent_id
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_permissions.parent_id
     *
     * @param parentId the value for menu_permissions.parent_id
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getMenuLogo() {
        return menuLogo;
    }

    public void setMenuLogo(String menuLogo) {
        this.menuLogo = menuLogo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_permissions.create_time
     *
     * @return the value of menu_permissions.create_time
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_permissions.create_time
     *
     * @param createTime the value for menu_permissions.create_time
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_permissions.last_update_time
     *
     * @return the value of menu_permissions.last_update_time
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public String getAddOnly() {
        return addOnly;
    }

    public void setAddOnly(String addOnly) {
        this.addOnly = addOnly;
    }

    public String getDeleteOnly() {
        return deleteOnly;
    }

    public void setDeleteOnly(String deleteOnly) {
        this.deleteOnly = deleteOnly;
    }

    public String getEditOnly() {
        return editOnly;
    }

    public void setEditOnly(String editOnly) {
        this.editOnly = editOnly;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExportOnly() {
        return exportOnly;
    }

    public void setExportOnly(String exportOnly) {
        this.exportOnly = exportOnly;
    }

    public String getDetailOnly() {
        return detailOnly;
    }

    public void setDetailOnly(String detailOnly) {
        this.detailOnly = detailOnly;
    }

    public String getImportOnly() {
        return importOnly;
    }

    public void setImportOnly(String importOnly) {
        this.importOnly = importOnly;
    }

    public String getOtherOnly() {
        return otherOnly;
    }

    public void setOtherOnly(String otherOnly) {
        this.otherOnly = otherOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_permissions.last_update_time
     *
     * @param lastUpdateTime the value for menu_permissions.last_update_time
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_permissions
     *
     * @mbg.generated Tue Dec 26 20:54:23 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", addOnly=").append(addOnly);
        sb.append(", deleteOnly=").append(deleteOnly);
        sb.append(", editOnly=").append(editOnly);
        sb.append(", type=").append(type);
        sb.append(", exportOnly=").append(exportOnly);
        sb.append(", detailOnly=").append(detailOnly);
        sb.append(", importOnly=").append(importOnly);
        sb.append(", otherOnly=").append(otherOnly);
        sb.append(", otherOnly=").append(otherOnly);
        sb.append(", otherOnly=").append(otherOnly);
        sb.append(", otherOnly=").append(otherOnly);
        sb.append(", otherOnly=").append(otherOnly);
        sb.append(", rank=").append(rank);
        sb.append(", appUrl=").append(appUrl);
        sb.append(", menuLogo=").append(menuLogo);
        sb.append(", link=").append(link);
        sb.append("]");
        return sb.toString();
    }
}