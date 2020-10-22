/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_tickets;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author asraf
 */
@Entity
@Table(name = "MOVIESTB", catalog = "", schema = "MOVIE")
@NamedQueries({
    @NamedQuery(name = "Moviestb.findAll", query = "SELECT m FROM Moviestb m")
    , @NamedQuery(name = "Moviestb.findByMoviename", query = "SELECT m FROM Moviestb m WHERE m.moviename = :moviename")
    , @NamedQuery(name = "Moviestb.findByPrice", query = "SELECT m FROM Moviestb m WHERE m.price = :price")
    , @NamedQuery(name = "Moviestb.findByReleasedate", query = "SELECT m FROM Moviestb m WHERE m.releasedate = :releasedate")})
public class Moviestb implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MOVIENAME")
    private String moviename;
    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "RELEASEDATE")
    @Temporal(TemporalType.DATE)
    private Date releasedate;

    public Moviestb() {
    }

    public Moviestb(String moviename) {
        this.moviename = moviename;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        String oldMoviename = this.moviename;
        this.moviename = moviename;
        changeSupport.firePropertyChange("moviename", oldMoviename, moviename);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        Date oldReleasedate = this.releasedate;
        this.releasedate = releasedate;
        changeSupport.firePropertyChange("releasedate", oldReleasedate, releasedate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moviename != null ? moviename.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moviestb)) {
            return false;
        }
        Moviestb other = (Moviestb) object;
        if ((this.moviename == null && other.moviename != null) || (this.moviename != null && !this.moviename.equals(other.moviename))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "movie_tickets.Moviestb[ moviename=" + moviename + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
