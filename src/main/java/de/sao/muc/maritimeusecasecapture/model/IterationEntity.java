package de.sao.muc.maritimeusecasecapture.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "iteration", schema = "use_case_db", catalog = "")
public class IterationEntity {
    private int id;
    private Timestamp date;
    private String status;
    private String author;
    private int useCaseId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "use_case_id")
    public int getUseCaseId() {
        return useCaseId;
    }

    public void setUseCaseId(int useCaseId) {
        this.useCaseId = useCaseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IterationEntity that = (IterationEntity) o;

        if (id != that.id) return false;
        if (useCaseId != that.useCaseId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + useCaseId;
        return result;
    }
}
