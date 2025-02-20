# AI-BASED-RECOMMENDATION-SYSTEM
*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: ISHA TANTAK

*INTERN ID*:CODHC109

*DOMAIN*:JAVA DEVELOPEMENT

*DURATION*:4 WEEKS

*MENTOR*:NEELA SANTOSH


---

# **Recommendation System Using Apache Mahout**

This is a Java-based recommendation engine built using **Apache Mahout**, which suggests products or content based on user preferences. The system uses **Collaborative Filtering** and **Item-Based Recommender** techniques to provide personalized recommendations.

## **Features**
- Recommends items to users based on past ratings.
- Uses **Item-Based Collaborative Filtering** to calculate item similarities.
- Built using **Apache Mahout** machine learning library.
- Can be extended to use content-based or hybrid recommendation approaches.

## **Technologies Used**
- **Java**: Programming language used to build the recommendation system.
- **Apache Mahout**: A machine learning library for building recommendation systems.
- **CSV Data**: Sample dataset used to simulate user-item interactions and ratings.

## **Dataset**
A sample dataset (`ratings.csv`) with user ratings of various items:

```csv
userId,itemId,rating
1,101,5
1,102,3
1,103,2
2,101,4
2,102,5
2,104,4
3,103,5
3,104,2
4,101,4
4,102,3
```

### **Dataset Columns**
- `userId`: The ID of the user.
- `itemId`: The ID of the item (product/content).
- `rating`: The rating given by the user to the item.

## **Setup Instructions**

### **1. Clone the Repository**

Clone the repository to your local machine:


git clone https://github.com/your-username/recommendation-engine.git
cd recommendation-engine


### **2. Install Dependencies**

If you’re using Maven, add Apache Mahout to your `pom.xml` file:

```xml
<dependency>
    <groupId>org.apache.mahout</groupId>
    <artifactId>mahout-core</artifactId>
    <version>0.13.0</version> <!-- or the latest version -->
</dependency>
```

Alternatively, you can download and include **Apache Mahout** manually.

### **3. Prepare the Dataset**

Ensure that the dataset `ratings.csv` is placed in the root directory of the project.

### **4. Compile and Run the Program**

To compile and run the recommendation engine:

1. Compile the Java files:


javac RecommendationEngine.java


2. Run the program:


java RecommendationEngine


The program will read the `ratings.csv` file, calculate item similarities, and generate recommendations for the specified user.

## **Example Output**

Example output showing the recommendations for a user:


Recommendations for User 1:
Item ID: 104, Value: 4.0
Item ID: 103, Value: 3.5
Item ID: 102, Value: 3.0


These are the recommended items for **User 1** based on their past ratings.

## **Extending the System**

1. **Improving Data**: Use a larger dataset with more users and items to improve recommendation accuracy.
2. **Real-Time Data**: Connect the system to a real-time database to fetch live user ratings and items.
3. **Content-Based Filtering**: Implement content-based recommendations using item features (like descriptions, categories, etc.).
4. **Hybrid Approach**: Combine collaborative filtering and content-based filtering for more accurate recommendations.




This `README.md` will guide users through setting up, running, and understanding the recommendation engine project.

#OUTPUT:
