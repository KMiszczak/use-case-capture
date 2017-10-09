package de.sao.muc.maritimeusecasecapture.model;

import javax.persistence.*;

@Entity
@Table(name = "use_case", schema = "use_case_db", catalog = "")
public class UseCaseEntity {
    private int id;
    private String title;
    private int version;
    private boolean status;
    private int userId;
    private int projectId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "version")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Basic
    @Column(name = "status")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UseCaseEntity that = (UseCaseEntity) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (status != that.status) return false;
        if (userId != that.userId) return false;
        if (projectId != that.projectId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + (status ? 1 : 0);
        result = 31 * result + userId;
        result = 31 * result + projectId;
        return result;
    }
}
