package de.sao.muc.maritimeusecasecapture.model;

import javax.persistence.*;

@Entity
@Table(name = "narrative", schema = "use_case_db", catalog = "")
public class NarrativeEntity {
    private int id;
    private String shortDescription;
    private String longDescription;
    private String generalMarks;
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
    @Column(name = "short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Basic
    @Column(name = "long_description")
    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Basic
    @Column(name = "general_marks")
    public String getGeneralMarks() {
        return generalMarks;
    }

    public void setGeneralMarks(String generalMarks) {
        this.generalMarks = generalMarks;
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

        NarrativeEntity that = (NarrativeEntity) o;

        if (id != that.id) return false;
        if (useCaseId != that.useCaseId) return false;
        if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
            return false;
        if (longDescription != null ? !longDescription.equals(that.longDescription) : that.longDescription != null)
            return false;
        if (generalMarks != null ? !generalMarks.equals(that.generalMarks) : that.generalMarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (longDescription != null ? longDescription.hashCode() : 0);
        result = 31 * result + (generalMarks != null ? generalMarks.hashCode() : 0);
        result = 31 * result + useCaseId;
        return result;
    }
}
