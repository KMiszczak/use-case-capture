package de.sao.muc.maritimeusecasecapture.model;

import javax.persistence.*;

@Entity
@Table(name = "actuator", schema = "use_case_db", catalog = "")
public class ActuatorEntity {
    private int id;
    private String actuator;
    private String actuatorEvent;
    private String preconditions;
    private String assumptions;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "actuator")
    public String getActuator() {
        return actuator;
    }

    public void setActuator(String actuator) {
        this.actuator = actuator;
    }

    @Basic
    @Column(name = "actuator_event")
    public String getActuatorEvent() {
        return actuatorEvent;
    }

    public void setActuatorEvent(String actuatorEvent) {
        this.actuatorEvent = actuatorEvent;
    }

    @Basic
    @Column(name = "preconditions")
    public String getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(String preconditions) {
        this.preconditions = preconditions;
    }

    @Basic
    @Column(name = "assumptions")
    public String getAssumptions() {
        return assumptions;
    }

    public void setAssumptions(String assumptions) {
        this.assumptions = assumptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActuatorEntity that = (ActuatorEntity) o;

        if (id != that.id) return false;
        if (actuator != null ? !actuator.equals(that.actuator) : that.actuator != null) return false;
        if (actuatorEvent != null ? !actuatorEvent.equals(that.actuatorEvent) : that.actuatorEvent != null)
            return false;
        if (preconditions != null ? !preconditions.equals(that.preconditions) : that.preconditions != null)
            return false;
        if (assumptions != null ? !assumptions.equals(that.assumptions) : that.assumptions != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (actuator != null ? actuator.hashCode() : 0);
        result = 31 * result + (actuatorEvent != null ? actuatorEvent.hashCode() : 0);
        result = 31 * result + (preconditions != null ? preconditions.hashCode() : 0);
        result = 31 * result + (assumptions != null ? assumptions.hashCode() : 0);
        return result;
    }
}
