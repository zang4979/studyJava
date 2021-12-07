package com.it.study.oop12.cc;

public interface Filter {
    void filterUser(User u);

}

class V1Filter implements Filter {
    @Override
    public void filterUser(User u) {
        u.setType("V1");
    }
}

class V2Filter implements Filter {
    @Override
    public void filterUser(User u) {
        u.setType("V2");

    }
}

class AFilter implements Filter {
    @Override
    public void filterUser(User u) {
        u.setType("A");
    }
}

class Receptionist {
    private Filter filter;

    public Receptionist(Filter filter) {
        super();
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void recept(User u) {
        if (u.getType() != null) {
            return;

        }
        filter.filterUser(u);


    }
}

