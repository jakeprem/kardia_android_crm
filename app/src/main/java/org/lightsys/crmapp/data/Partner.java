package org.lightsys.crmapp.data;

import java.util.List;

/**
 * Created by nathan on 3/9/16.
 *
 * methods get and set info within database
 */
public class Partner {
    private String partnerId;
    private String partnerName;
    private String profilePictureFilename;
    private String surname;
    private String givenNames;

    private String address1;
    private String city;
    private String stateProvince;
    private String postalCode;

    private String cell;
    private String phone;
    private String email;

    /*
    private String blog;
    private String fax;
    private String facebook;
    private String skype;
    private String twitter;
    private String website;
    */

    //private List<Contact> contacts;
    //private List<Address> addresses;

    // Default constructor for a partner with no given info
    public Partner() {

    }

    // Constructor for a partner given their Id
    public Partner(String partnerId) {

        this.partnerId = partnerId;
    }

    public Partner(String partnerId, String partnerName) {
        this.partnerId = partnerId;
        this.partnerName = partnerName;
    }


    //get and set ID and names for a contact
    public String getPartnerId() {

        return partnerId;
    }

    public String getPartnerName() {

        return partnerName;
    }

    public void setPartnerId(String partnerId) {

        this.partnerId = partnerId;
    }

    public void setPartnerName(String partnerName) {

        this.partnerName = partnerName;
    }

    public String getProfilePictureFilename() {

        return profilePictureFilename;
    }

    public void setProfilePictureFilename(String profilePictureFilename) {
        this.profilePictureFilename = profilePictureFilename;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenNames() {
        return givenNames;
    }

    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }



    //gets full/ complete address for when display address within a contact's profile
    public String getFullAddress() {
        return getAddress1() + ", " + getCity() + ", " + getStateProvince() + " " + getPostalCode();
    }

    public void setFullAddress(String address, String city, String state, String zipCode) {
        this.address1 = address;
        this.city = city;
        this.stateProvince = state;
        this.postalCode = zipCode;
    }


    //get and set various components of a contact's address
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address) {
        this.address1 = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }




    //get and set various info for contacting a contact
    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    /*
    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String skype() {
        return skype;
    }

    public void skype(String skype) {
        this.skype = skype;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }*/





    /*public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }*/
}
