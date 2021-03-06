package co.edu.uniandes.hrs.shared;

import java.io.Serializable;

public class CFParameters implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String datasetSize="";
	private String neighbors="";
	private String ratings="";
	private String measureType="";
	private String recommenderType="";
	private String user="0";

	public CFParameters() {
		this.datasetSize = "60 %";
		this.neighbors = "10";
		this.ratings = "10";
		this.measureType = "true";
		this.recommenderType = "true";
		this.user = "1";
	}
	
	/**
	 * @param datasetSize
	 * @param neighbors
	 * @param ratings
	 * @param measureType
	 * @param recommenderType
	 * @param user
	 */
	public CFParameters(String datasetSize, String neighbors, String ratings,
			String measureType, String recommenderType, String user) {
		super();
		this.datasetSize = datasetSize;
		this.neighbors = neighbors;
		this.ratings = ratings;
		this.measureType = measureType;
		this.recommenderType = recommenderType;
		this.user = user;
	}


	/**
	 * @return the datasetSize
	 */
	public String getDatasetSize() {
		return datasetSize;
	}
	/**
	 * @param datasetSize the datasetSize to set
	 */
	public void setDatasetSize(String datasetSize) {
		this.datasetSize = datasetSize;
	}
	/**
	 * @return the neighbors
	 */
	public String getNeighbors() {
		return neighbors;
	}
	/**
	 * @param neighbors the neighbors to set
	 */
	public void setNeighbors(String neighbors) {
		this.neighbors = neighbors;
	}
	/**
	 * @return the ratings
	 */
	public String getRatings() {
		return ratings;
	}

	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	/**
	 * @return the measureType
	 */
	public String getMeasureType() {
		return measureType;
	}
	/**
	 * @param measureType the measureType to set
	 */
	public void setMeasureType(String measureType) {
		this.measureType = measureType;
	}
	/**
	 * @return the recommenderType
	 */
	public String getRecommenderType() {
		return recommenderType;
	}
	/**
	 * @param recommenderType the recommenderType to set
	 */
	public void setRecommenderType(String recommenderType) {
		this.recommenderType = recommenderType;
	}
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	
	
}
