package it.stepwise.alfresco.restapiclient.core.nodes;

import it.stepwise.alfresco.restapiclient.AlfrescoRestApi;
import it.stepwise.alfresco.restapiclient.common.Constants;
import it.stepwise.alfresco.restapiclient.util.APIUtil;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.json.JSONArray;
import org.json.JSONObject;

public class NodesApi {

    public static final String BASE_URL_CORE_NODES_API = "alfresco/api/-default-/public/alfresco/versions/" + Constants.NUM_VERSION_PLACEHOLDER + "/nodes/" + Constants.NODE_ID_PLACEHOLDER;

    private AlfrescoRestApi alfrescoRestApi;
    private int numVersion;

    public NodesApi(AlfrescoRestApi alfrescoRestApi) {
        this.alfrescoRestApi = alfrescoRestApi;
        this.numVersion = 1;
    }

    public NodesApi(AlfrescoRestApi alfrescoRestApi, int numVersion) {
        this.alfrescoRestApi = alfrescoRestApi;
        this.numVersion = numVersion;
    }

    public ImmutablePair<Integer, JSONObject> createNode(String nodeId, JSONObject jsonCreateNode) {
        APIUtil.insertVersionInURL(BASE_URL_CORE_NODES_API, this.numVersion);
        return null;
    }

    public ImmutablePair<Integer, JSONObject> updateNode(String nodeId, JSONObject jsonBodyUpdate) {
        APIUtil.insertVersionInURL(BASE_URL_CORE_NODES_API, this.numVersion);
        return null;
    }

    public boolean lockNode(String nodeId, JSONObject nodeBodyLock) {
        APIUtil.insertVersionInURL(BASE_URL_CORE_NODES_API, this.numVersion);
        return false;
    }

    public ImmutablePair<Integer, JSONObject> moveNode(String nodeId, JSONObject jsonMoveNode) {
        APIUtil.insertVersionInURL(BASE_URL_CORE_NODES_API, this.numVersion);
        return null;
    }

    public ImmutablePair<Integer, JSONArray> getListNodeChildren(String nodeId) {
        APIUtil.insertVersionInURL(BASE_URL_CORE_NODES_API, this.numVersion);
        return null;
    }

    public ImmutablePair<Integer, JSONObject> getNode(String nodeId) {
        APIUtil.insertVersionInURL(BASE_URL_CORE_NODES_API, this.numVersion);
        return null;
    }

    // TODO: Possibile enum per il body di lock node
//    public enum LifetimeEnum {
//        PERSISTENT("PERSISTENT"),
//
//        EPHEMERAL("EPHEMERAL");
//
//        private String value;
//
//        LifetimeEnum(String value) {
//            this.value = value;
//        }
//    }

}
