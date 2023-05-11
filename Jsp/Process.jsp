<% 
    int p = Integer.parseInt(request.getParameter("principle"));
    int p = Integer.parseInt(request.getParameter("time"));
    int p = Integer.parseInt(request.getParameter("rate"));
    
    out.println(p*t*r*0.01)
%>