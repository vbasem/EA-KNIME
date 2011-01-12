package node;

import org.knime.core.node.NodeView;

/**
 * <code>NodeView</code> for the "EvolutionaryAlgorithm" Node.
 * Node that allows to apply EA method to given data and defined fitness function
 *
 * @author basem
 */
public class EvolutionaryAlgorithmNodeView extends NodeView<EvolutionaryAlgorithmNodeModel> {

    /**
     * Creates a new view.
     * 
     * @param nodeModel The model (class: {@link EvolutionaryAlgorithmNodeModel})
     */
    protected EvolutionaryAlgorithmNodeView(final EvolutionaryAlgorithmNodeModel nodeModel) {
        super(nodeModel);

        // TODO instantiate the components of the view here.

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void modelChanged() {

        // TODO retrieve the new model from your nodemodel and 
        // update the view.
        EvolutionaryAlgorithmNodeModel nodeModel = 
            (EvolutionaryAlgorithmNodeModel)getNodeModel();
        assert nodeModel != null;
        
        // be aware of a possibly not executed nodeModel! The data you retrieve
        // from your nodemodel could be null, emtpy, or invalid in any kind.
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onClose() {
    
        // TODO things to do when closing the view
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onOpen() {

        // TODO things to do when opening the view
    }

}

