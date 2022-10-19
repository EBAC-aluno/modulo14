package pojo.domain;

import java.util.Objects;

public class Client {
    
    private String name;
    private Long cpf;
    private Long telephone;
    private String address;
    private Integer houseNumber;
    private String city;
    private String state;

    public Client(String name, String cpf, String telephone, String adress, String houseNumber, String city, String state) {
        this.name = name;
        this.cpf = Long.valueOf(cpf);
        this.telephone = Long.valueOf(telephone);
        this.address = adress;
        this.houseNumber = Integer.valueOf(houseNumber);
        this.city = city;
        this.state = state;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public String getStreetAddress() {
        return address;
    }

    public void setStreetAddress(String address) {
        this.address = address;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer number) {
        this.houseNumber = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEstate() {
        return state;
    }

    public void setEstate(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
}
