package de.msg.training.examples.refactoring;

public class FileSystemDocumentDao implements DocumentDao {

  @Override
  public DataSet getDocument(final int dataseId) {
    return new DataSet();
  }

}
