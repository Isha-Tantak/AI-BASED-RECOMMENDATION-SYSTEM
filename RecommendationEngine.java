import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.PreferenceArray;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RecommendationEngine {

    public static void main(String[] args) throws Exception {

        // Load the dataset (ratings.csv file)
        DataModel model = new FileDataModel(new File("ratings.csv"));
        
        // Compute the similarity between items
        ItemSimilarity similarity = new TanimotoCoefficientSimilarity(model);
        
        // Create an ItemBasedRecommender
        GenericItemBasedRecommender recommender = new GenericItemBasedRecommender(model, similarity);
        
        // Get recommendations for a specific user (for example, user 1)
        List<RecommendedItem> recommendations = recommender.recommend(1, 3);
        
        // Display the recommendations
        System.out.println("Recommendations for User 1:");
        for (RecommendedItem recommendation : recommendations) {
            System.out.println("Item ID: " + recommendation.getItemID() + ", Value: " + recommendation.getValue());
        }
    }
}
