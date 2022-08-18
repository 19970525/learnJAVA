package com.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-15
 */
public class AddressDao {

    private List addressList;
    private Set addressSet;
    private Map addressMap;
    private Properties addressProps;

    public List getAddressList() {
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressProps() {
        return addressProps;
    }

    public void setAddressProps(Properties addressProps) {
        this.addressProps = addressProps;
    }

    @Override
    public String toString() {
        return "AddressDao{" +
                "addressList=" + addressList +
                ", addressSet=" + addressSet +
                ", addressMap=" + addressMap +
                ", addressProps=" + addressProps +
                '}';
    }
}
