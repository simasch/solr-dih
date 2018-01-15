# How to use Apache Solr Data Import Handler

This project shows how you can use the Apache Solr Data Import Handler(DIH) to import data from a SQL database into a Apache Solr search index.

## Setup

### Apache Solr

#### Download and Start

The example uses Apache Solr so you must download and install the newest version:
http://lucene.apache.org/solr/mirrors-solr-latest-redir.html
  
Start Solr at the default port 8983:
    
    solr start -p 8983
    
To stop solr use:

    solr stop -p 8983
    
    
#### Configuration 

From the directory `solr` copy the folder `products` to `<solr-installation-directory>/server/solr` 

### Database

PostgreSQL is used but the example would work with any SQL database.

### Setup

There are many binaries available: https://www.postgresql.org/download/

If you don't want to install PosgreSQL you can use one of these:

- Windows: PosgreSQL Portable: https://gareth.flowers/postgresql-portable/
- Mac: Postgres.app http://postgresapp.com/

### User and Schema

Create a user called user with the same password and a database with the name products.

That's it!

