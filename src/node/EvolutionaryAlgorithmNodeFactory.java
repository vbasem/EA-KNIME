package node;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "EvolutionaryAlgorithm" Node.
 * Node that allows to apply EA method to given data and defined fitness function
 *
 * @author basem
 */
public class EvolutionaryAlgorithmNodeFactory 
        extends NodeFactory<EvolutionaryAlgorithmNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public EvolutionaryAlgorithmNodeModel createNodeModel() {
        return new EvolutionaryAlgorithmNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<EvolutionaryAlgorithmNodeModel> createNodeView(final int viewIndex,
            final EvolutionaryAlgorithmNodeModel nodeModel) {
        return new EvolutionaryAlgorithmNodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new EvolutionaryAlgorithmNodeDialog();
    }

}

